package org.springframework.fu.kofu.samples

import org.springframework.boot.WebApplicationType
import org.springframework.fu.kofu.application
import org.springframework.fu.kofu.webflux.webClient
import org.springframework.fu.kofu.webflux.webFlux

fun jacksonDsl() {
	application(WebApplicationType.REACTIVE) {
		webFlux {
			codecs {
				jackson()
			}
		}
		webClient {
			codecs {
				jackson()
			}
		}
	}
}