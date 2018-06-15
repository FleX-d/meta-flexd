DESCRIPTION = "RSM"
SECTION = "library"
LICENSE = "CLOSED"
DEPENDS = "mosquitto icl ltd"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/FleX-d/RSM;branch=devMatusMCM"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DENABLE_TESTS=off"

inherit pkgconfig cmake 


 
