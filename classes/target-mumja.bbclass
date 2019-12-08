# Core packages for every image

IMAGE_INSTALL_append = " mumjolandia"

# Python
IMAGE_INSTALL_append = " python3"
IMAGE_INSTALL_append = " python3-pip"

# ssh
IMAGE_INSTALL_append = " packagegroup-core-ssh-openssh"
IMAGE_INSTALL_append = " openssh-sftp-server"

