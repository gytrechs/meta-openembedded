SUMMARY = "ExtUtils::CppGuess - guess C++ compiler and flags"
DESCRIPTION = "ExtUtils::CppGuess attempts to guess the system's C++ \
compiler that is compatible with the C compiler that your perl was built \
with. \
It can generate the necessary options to the Module::Build constructor or \
to ExtUtils::MakeMaker's WriteMakefile function."
SECTION = "libs"

HOMEPAGE = "http://search.cpan.org/~smueller/ExtUtils-CppGuess/"

LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
LIC_FILES_CHKSUM = "file://README;beginline=81;endline=84;md5=84c0390b90ea8c6702ce659b67bed699"

SRC_URI = "${CPAN_MIRROR}/authors/id/E/ET/ETJ/ExtUtils-CppGuess-${PV}.tar.gz"
SRC_URI[sha256sum] = "f96c48984eb6d8efb7d933b34f361d0c8b38335e3e5382e9aeccc0aa519a002c"

S = "${WORKDIR}/ExtUtils-CppGuess-${PV}"

inherit cpan

do_install () {
        cpan_do_install
}

RDEPENDS:${PN} = " libcapture-tiny-perl \
                   perl-module-scalar-util \
                   perl-module-io-file \
                   perl-module-extutils-makemaker \
                   perl-module-file-spec \
                   perl-module-exporter \
                   perl-module-carp \
                   perl-module-file-temp \
                   perl-module-lib \
"

BBCLASSEXTEND = "native"
