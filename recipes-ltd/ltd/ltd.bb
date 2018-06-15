DESCRIPTION = "Logger"
SECTION = "library"

LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=662fd4d9d67a7f81cde6fef0f4696a80"

DEPENDS = "dlt-daemon git icl"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/FleX-d/LTD;branch=devLogger"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DENABLE_TESTS=off"

inherit pkgconfig cmake

do_install () {
       install -d ${D}${bindir}
       install -m 0755 ${WORKDIR}/build/apps/fleXdLoggerServer/fleXdLoggerServer ${D}${bindir}/fleXdLoggerServer
}

OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"