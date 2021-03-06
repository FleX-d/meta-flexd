DESCRIPTION = "JsonParser"
SECTION = "library"

LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=662fd4d9d67a7f81cde6fef0f4696a80"

DEPENDS = "nlohmann"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/FleX-d/ICL;branch=devIPC"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DENABLE_TESTS=off"

inherit pkgconfig cmake 

# TODO avoid INSANE_SKIP
INSANE_SKIP_${PN} += "installed-vs-shipped"
# TODO end

OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"