SUMMARY = "FleX-d image"
LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=662fd4d9d67a7f81cde6fef0f4696a80"

IMAGE_FEATURES += "ssh-server-openssh package-management debug-tweaks"

inherit core-image

IMAGE_INSTALL += "\
    openssh openssh-keygen openssh-sftp-server bash \
    ntp \
    mc nano iptables htop findutils strace binutils \
    kernel-modules load-modules e2fsprogs vlan \
    lxc crui \
    lxc-flexd-image-minimal \
    xz gnupg tar aufs-util \
    core icl ltd rsm mosquitto dockerapp \
"

export IMAGE_BASENAME = "flexd-image"
