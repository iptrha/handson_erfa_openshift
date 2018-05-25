# Introduction
# Prerequisites
1. [Install git](https://git-scm.com/downloads)
* [Download Openshift Commandline Tools "oc"](https://drive.google.com/drive/folders/135WgV-uiA6v8ya5pca2jCOejAxN6l8qY?usp=sharing)
* "Install oc": Unpack the archive and add it to your PATH (more info can be found [here](https://docs.openshift.com/container-platform/3.9/cli_reference/get_started_cli.html))

# Support

## OSX
### I am getting ```xcrun: error: (...)``` when running git. What can I do?
Install XCode commandline tools ```xcode-select --install``` (see [here]( https://stackoverflow.com/questions/32893412/command-line-tools-not-working-os-x-el-capitan-macos-sierra-macos-high-sierra/32894314#32894314) for more details)

### How to install Minishift on OSX?
Make your life easy and install [HomeBrew](https://brew.sh/index_de.html):
```bash
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
brew cask install minishift
brew install docker-machine-driver-xhyve
sudo chown root:wheel $(brew --prefix)/opt/docker-machine-driver-xhyve/bin/docker-machine-driver-xhyve
sudo chmod u+s $(brew --prefix)/opt/docker-machine-driver-xhyve/bin/docker-machine-driver-xhyve
eval $(minishift oc-env)
```

## Windows
### How to install Minishift on Windows?
Maybe this guide can help you, if you are lost: [bierkowski.com](https://bierkowski.com/minishift-setup-on-windows/)
