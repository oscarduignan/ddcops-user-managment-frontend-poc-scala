package uk.gov.hmrc.ddcopsusermanagmentfrontendpocscala.config

import javax.inject.{Inject, Singleton}
import play.api.Configuration

@Singleton
class AppConfig @Inject()
  (
    config: Configuration
  ) {
  val welshLanguageSupportEnabled: Boolean = config.getOptional[Boolean]("features.welsh-language-support").getOrElse(false)

}
