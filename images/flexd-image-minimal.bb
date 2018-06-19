SUMMARY = "FleX-d image minimal"
LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=662fd4d9d67a7f81cde6fef0f4696a80"

IMAGE_FEATURES += "package-management"

inherit core-image


IMAGE_INSTALL += "dpkg"

export IMAGE_BASENAME = "flexd-image-minimal"

