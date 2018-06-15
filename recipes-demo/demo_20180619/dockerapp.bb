DESCRIPTION = "dockerapp"
SECTION = "Core"

LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=662fd4d9d67a7f81cde6fef0f4696a80"

DEPENDS = "icl ltd"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/FleX-d/Demos.git;branch=dev"

S = "${WORKDIR}/git/20180619"

inherit pkgconfig cmake 

do_install () {
  install -d ${D}${bindir}
  install -m 0755 ${WORKDIR}/build/DockerApp/DockerApp ${D}${bindir}/dockerApp 
} 
