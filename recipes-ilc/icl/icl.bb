DESCRIPTION = "JsonParser"
SECTION = "library"
LICENSE = "CLOSED"
DEPENDS = "nlohmann"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/FleX-d/ICL;branch=devIPC"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DENABLE_TESTS=off"

inherit pkgconfig cmake 

OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"