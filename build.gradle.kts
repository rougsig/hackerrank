plugins {
  kotlin("jvm") version "1.3.70"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.70")

  testImplementation("org.testng:testng:6.10")
  testImplementation("org.assertj:assertj-core:3.6.2")
}

tasks.named<Test>("test") {
  isScanForTestClasses = false
  useTestNG()
  include("**/*")
}
