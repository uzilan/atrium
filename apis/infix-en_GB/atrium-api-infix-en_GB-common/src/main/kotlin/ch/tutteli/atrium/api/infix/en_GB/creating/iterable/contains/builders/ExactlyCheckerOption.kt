//TODO remove file with 1.0.0
@file:Suppress("DEPRECATION")

package ch.tutteli.atrium.api.infix.en_GB.creating.iterable.contains.builders

import ch.tutteli.atrium.domain.builders.creating.iterable.contains.builders.WithTimesCheckerOption
import ch.tutteli.atrium.domain.creating.iterable.contains.IterableContains

/**
 * Represents the extension point for another option after a `contains exactly`-check within
 * a sophisticated `contains` assertion building process for [Iterable].
 *
 * @param T The input type of the search.
 * @param S The search behaviour which should be applied for the input of the search.
 */
@Deprecated(
    "Use ExactlyCheckerStep from atrium-logic; will be removed with 1.0.0",
    ReplaceWith("ch.tutteli.atrium.logic.creating.iterable.contains.steps.ExactlyCheckerStep")
)
interface ExactlyCheckerOption<out E, out T : Iterable<E>, out S : IterableContains.SearchBehaviour>
    : WithTimesCheckerOption<E, T, S>
