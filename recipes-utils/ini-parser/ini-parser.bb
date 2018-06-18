DESCRIPTION = "IniParser"
SECTION = "library"

LICENSE = "CLOSED"
# TODO
#LICENSE = "BSD-3"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=662fd4d9d67a7f81cde6fef0f4696a80"
# TODO

DEPENDS = ""

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/FleX-d/ini-parser;branch=master"

SRC_URI[md5sum] = "aac9849ec7c1839830381c29a1758a2c"
SRC_URI[sha256sum] = "126258d6334a57f349d493dfca4b2683d2ff3b02bb173e6bb8f70809de0d994e"

S = "${WORKDIR}/git"

inherit pkgconfig cmake 

OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"

