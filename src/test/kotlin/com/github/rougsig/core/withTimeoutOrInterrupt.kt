package com.github.rougsig.core

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withTimeout
import java.util.concurrent.CancellationException
import java.util.concurrent.Executors
import kotlin.coroutines.resumeWithException

private val threadPool = Executors.newCachedThreadPool()
suspend fun <T> withTimeoutOrInterrupt(timeMillis: Long, block: () -> T) {
  withTimeout(timeMillis) {
    suspendCancellableCoroutine<Unit> { cont ->
      val future = threadPool.submit {
        try {
          block()
          cont.resumeWith(Result.success(Unit))
        } catch (e: InterruptedException) {
          cont.resumeWithException(CancellationException())
        } catch (e: Throwable) {
          cont.resumeWithException(e);
        }
      }
      cont.invokeOnCancellation {
        future.cancel(true)
      }
    }
  }
}
