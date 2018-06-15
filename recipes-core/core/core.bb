DESCRIPTION = "CoreApp"
SECTION = "Core"
LICENSE = "CLOSED"
DEPENDS = "icl ltd sqlite3 rsm"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/FleX-d/Core;branch=devCoreApp"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DENABLE_TESTS=off"

inherit pkgconfig cmake 

do_install () {
  install -d ${D}${bindir}
  install -m 0755 ${WORKDIR}/build/apps/CoreApp/CoreApp ${D}${bindir} 
  
  sh ${WORKDIR}/git/apps/CoreApp/tools/dbInit.sh
  install ${WORKDIR}/git/apps/CoreApp/tools/CoreAppDb.db ${D}${bindir} 
}