DESCRIPTION = "Mumjolandia app"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r0"

SRC_URI = "git://github.com/mumja92/mumjolandia.git;protocol=git;branch=master"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "python3"
RDEPENDS_${PN} += "python3-core"

do_install() {
    install -d ${D}${USRBINPATH}/mumjolandia_files/src
    install -m 0755 main.py ${D}${USRBINPATH}/mumjolandia_files/mumjolandia.py
    cp -r src ${D}${USRBINPATH}/mumjolandia_files/
    ln -s -r ${D}${USRBINPATH}/mumjolandia_files/mumjolandia.py ${D}${USRBINPATH}/mumjolandia
}
