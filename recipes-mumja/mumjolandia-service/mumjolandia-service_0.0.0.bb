DESCRIPTION = "Mumjolandia in server mode as systemd service"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r0"

SRC_URI = "file://mumjolandia.service"

inherit systemd

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " mumjolandia.service"

RDEPENDS_${PN} += "mumjolandia"

do_install() {
    install -d ${D}${systemd_system_unitdir} 
    install -m 0755 ${WORKDIR}/mumjolandia.service ${D}${systemd_system_unitdir}
}
