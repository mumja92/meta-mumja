inherit core-image

IMAGE_INSTALL_XFCE = " \
    packagegroup-core-boot \
    packagegroup-core-x11 \
    packagegroup-xfce-base \
    kernel-modules \
"

inherit distro_features_check
REQUIRED_DISTRO_FEATURES = "x11"

IMAGE_INSTALL_append = " ${IMAGE_INSTALL_XFCE}"

