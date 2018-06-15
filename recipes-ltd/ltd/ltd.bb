DESCRIPTION = "Logger"
SECTION = "library"
LICENSE = "CLOSED"
DEPENDS = "dlt-daemon git icl"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/FleX-d/LTD;branch=devLogger"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DENABLE_TESTS=off"

inherit pkgconfig cmake

OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"