DESCRIPTION = "Nlohmann"
SECTION = "library"
LICENSE = "CLOSED"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/nlohmann/json"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DJSON_BuildTests=off"

inherit pkgconfig cmake