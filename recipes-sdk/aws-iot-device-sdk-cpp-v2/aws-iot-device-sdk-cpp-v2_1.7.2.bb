inherit cmake
require aws-iot-device-sdk-cpp-v2.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=f91e61641e7a96835dea6926a65f4702"

BRANCH ?= "main"

SRC_URI = "git://github.com/aws/aws-iot-device-sdk-cpp-v2.git;branch=${BRANCH};name=aws-iot-device-sdk-cpp-v2"
SRCREV = "38f166a5baa2f50b4d55e274778a3b2a4c1dd082"
