DESCRIPTION = "Logger"
SECTION = "Core"

LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=662fd4d9d67a7f81cde6fef0f4696a80"

DEPENDS = "lxc"

SRCREV = "${AUTOREV}"
SRC_URI = "file://${PV}/build_id \
           file://${PV}/config \
           file://${PV}/config.x \
           file://${PV}/config-user \
           file://${PV}/config-user.x \
           file://${PV}/create-message \
           file://${PV}/excludes-user \
           file://${PV}/expiry \
           file://${PV}/rootfs.tar.xz;unpack=0 \
           file://${PV}/templates \
"

S = "${WORKDIR}/${PV}"

do_install () {
}

do_install_append () {
    template="/var/cache/lxc/download/FleX-d/minimal_${PV}/armhf/default"
    install -d ${D}${template}
    install -m 0755 ${S}/build_id ${D}${template}/
    install -m 0755 ${S}/config ${D}${template}/
    install -m 0755 ${S}/config-user ${D}${template}/
    install -m 0755 ${S}/create-message ${D}${template}/
    install -m 0755 ${S}/excludes-user ${D}${template}/
    install -m 0755 ${S}/expiry ${D}${template}/
    install -m 0755 ${S}/rootfs.tar.xz ${D}${template}/
    install -m 0755 ${S}/templates ${D}${template}/
    install -m 0755 ${S}/config-user.x ${D}${template}/config-user.1
    install -m 0755 ${S}/config-user.x ${D}${template}/config-user.2
    install -m 0755 ${S}/config-user.x ${D}${template}/config-user.3
    install -m 0755 ${S}/config-user.x ${D}${template}/config-user.4
    install -m 0755 ${S}/config.x ${D}${template}/config.1
    install -m 0755 ${S}/config.x ${D}${template}/config.2
    install -m 0755 ${S}/config.x ${D}${template}/config.3
    install -m 0755 ${S}/config.x ${D}${template}/config.4
}

FILES_${PN} = "/var/*"
