# TosteyGitlibrary

> Step 1. Add the JitPack repository to your build file

```gradle 
	dependencyResolutionManagement {
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
 ```
 > Step 2. Add the dependency
```gradle

dependencies {
	        implementation 'com.github.tuhineashin:TosteyGitlibrary:Tag'
	}
```

 > Step 3. Add Java code
```java

  Toaster.SimpleToastGit(MainActivity.this, "Hello World");



```
 
