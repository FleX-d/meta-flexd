DESCRIPTION = "Logger"
SECTION = "Core"

LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=662fd4d9d67a7f81cde6fef0f4696a80"

DEPENDS = "lxc"

SRCREV = "${AUTOREV}"
SRC_URI = "files:/${PV}/build_id \
           files:/${PV}/cmd \
           files:/${PV}/config \
           files:/${PV}/config.x \
           files:/${PV}/config-user \
           files:/${PV}/config-user.x \
           files:/${PV}/create-message \
           files:/${PV}/excludes-user \
           files:/${PV}/expiry \
           files:/${PV}/rootfs.tar.xz \
           files:/${PV}/templates \
"

S = "${WORKDIR}/${PV}"

do_install () {
    template="/var/cache/lxc/download/FleX-d/minimal_1.0/armhf/default"
    install -d ${D}${template}/
    install -m 0755 ${WORKDIR}/build_id ${D}${template}/
    install -m 0755 ${WORKDIR}/cmd ${D}${template}/
    install -m 0755 ${WORKDIR}/config ${D}${template}/
    install -m 0755 ${WORKDIR}/config-user ${D}${template}/
    install -m 0755 ${WORKDIR}/create-message ${D}${template}/
    install -m 0755 ${WORKDIR}/excludes-user ${D}${template}/
    install -m 0755 ${WORKDIR}/expiry ${D}${template}/
    install -m 0755 ${WORKDIR}/rootfs.tar.xz ${D}${template}/
    install -m 0755 ${WORKDIR}/templates ${D}${template}/
    install -m 0755 ${WORKDIR}/config-user.x ${D}${template}/config-user.1
    install -m 0755 ${WORKDIR}/config-user.x ${D}${template}/config-user.2
    install -m 0755 ${WORKDIR}/config-user.x ${D}${template}/config-user.3
    install -m 0755 ${WORKDIR}/config-user.x ${D}${template}/config-user.4
    install -m 0755 ${WORKDIR}/config.x ${D}${template}/config.1
    install -m 0755 ${WORKDIR}/config.x ${D}${template}/config.2
    install -m 0755 ${WORKDIR}/config.x ${D}${template}/config.3
    install -m 0755 ${WORKDIR}/config.x ${D}${template}/config.4
}
