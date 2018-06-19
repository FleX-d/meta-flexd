DESCRIPTION = "CoreApp"
SECTION = "Core"

LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=662fd4d9d67a7f81cde6fef0f4696a80"

DEPENDS = "icl ltd sqlite3 rsm"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/FleX-d/Core;branch=devCoreApp"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DENABLE_TESTS=off"

inherit pkgconfig cmake 

do_install () {
  install -d ${D}${bindir}
  install -m 0755 ${WORKDIR}/build/apps/CoreApp/CoreApp ${D}${bindir}/coreApp
  
  cd ${WORKDIR}/git/apps/CoreApp/tools/
  sh ${WORKDIR}/git/apps/CoreApp/tools/dbInitYocto.sh
  install -d ${D}${sysconfdir}/CoreApp
  install -m 0755 ${WORKDIR}/git/apps/CoreApp/tools/CoreAppDb.db ${D}${sysconfdir}/CoreApp
}