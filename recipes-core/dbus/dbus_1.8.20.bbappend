#
# Copyright (C) 2014 Wind River Systems, Inc.
#
# LOCAL REV: add WR specific scripts
#

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://0001-generate-machine-id-in-dbus-service.patch \
"

pkg_postinst_dbus_prepend() {
	dbus-uuidgen --ensure 2>/dev/null
	readlink -f /sbin/init | grep systemd && exit 0
}
