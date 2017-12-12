FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.9.65"

SRCREV = "5c1521c32fbd3291918c28fb67524c0ae1a299fb"
SRC_URI = "git://github.com/raspberrypi/linux.git;branch=rpi-4.9.y"

LICENSE = "GPLv2"
COMPATIBLE_MACHINE = "raspberrypi"
KERN_INC_FILE = "empty.inc"
KERN_INC_FILE_rpi = "linux-raspberrypi.inc"

require ${KERN_INC_FILE}
