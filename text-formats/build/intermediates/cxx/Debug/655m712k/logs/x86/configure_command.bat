@echo off
"C:\\Users\\it\\AppData\\Local\\Android\\Sdk\\ndk\\25.2.9519653\\ndk-build.cmd" ^
  "NDK_PROJECT_PATH=null" ^
  "APP_BUILD_SCRIPT=C:\\Users\\it\\Desktop\\F_Source\\demo_fb_app\\text-formats\\src\\main\\jni\\Android.mk" ^
  "NDK_APPLICATION_MK=C:\\Users\\it\\Desktop\\F_Source\\demo_fb_app\\text-formats\\src\\main\\jni\\Application.mk" ^
  "APP_ABI=x86" ^
  "NDK_ALL_ABIS=x86" ^
  "NDK_DEBUG=1" ^
  "APP_PLATFORM=android-24" ^
  "NDK_OUT=C:\\Users\\it\\Desktop\\F_Source\\demo_fb_app\\text-formats\\build\\intermediates\\cxx\\Debug\\655m712k/obj" ^
  "NDK_LIBS_OUT=C:\\Users\\it\\Desktop\\F_Source\\demo_fb_app\\text-formats\\build\\intermediates\\cxx\\Debug\\655m712k/lib" ^
  -j6 ^
  "APP_SHORT_COMMANDS=false" ^
  "LOCAL_SHORT_COMMANDS=false" ^
  -B ^
  -n
