package ch.tutteli.atrium.core.robstoll.lib.reporting

import ch.tutteli.atrium.reporting.AtriumErrorAdjuster

/**
 * An implementation of an [AtriumErrorAdjuster] which adjust nothings.
 */
expect object NoOpAtriumErrorAdjuster : AtriumErrorAdjuster

/**
 * An implementation of an [AtriumErrorAdjuster] which adjust nothings and can be used by the platforms to provide the
 * actual type of [NoOpAtriumErrorAdjuster].
 */
abstract class NoOpAtriumErrorAdjusterCommon : AtriumErrorAdjuster {
    override fun adjustOtherThanStacks(throwable: Throwable) {}
    override fun adjust(throwable: Throwable) {}
}
