// TODO remove file with 1.0.0
@file:Suppress("DEPRECATION", "TYPEALIAS_EXPANSION_DEPRECATION")
package ch.tutteli.atrium.assertions

import ch.tutteli.atrium.creating.AssertionPlant
import ch.tutteli.atrium.creating.AssertionPlantNullable
import ch.tutteli.atrium.domain.builders.AssertImpl
import kotlin.reflect.*

@Deprecated("Use AssertImpl.feature.property; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.property(plant, property)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, TProperty : Any> _property(plant: AssertionPlant<T>, property: KProperty0<TProperty>): AssertionPlant<TProperty>
    = AssertImpl.feature.property(plant, property)

@Deprecated("Use AssertImpl.feature.property; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.property(plant, property, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, TProperty : Any> _property(plant: AssertionPlant<T>, property: KProperty0<TProperty>, assertionCreator: AssertionPlant<TProperty>.() -> Unit): AssertionPlant<TProperty>
    = AssertImpl.feature.property(plant, property, assertionCreator)

@Deprecated("Use AssertImpl.feature.property; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.property(plant, property)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, TProperty : Any?> _property(plant: AssertionPlant<T>, property: KProperty0<TProperty>): AssertionPlantNullable<TProperty>
    = AssertImpl.feature.property(plant, property)

//Arg0
@Deprecated("Use AssertImpl.feature.returnValueOf0; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf0(plant, method)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction0<TReturnValue>): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf0(plant, method)

@Deprecated("Use AssertImpl.feature.returnValueOf0; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf0(plant, method, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: () -> TReturnValue): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf0(plant, method, name)

@Deprecated("Use AssertImpl.feature.returnValueOf0; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf0(plant, method, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction0<TReturnValue>, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf0(plant, method, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf0; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf0(plant, method, name, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: () -> TReturnValue, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf0(plant, method, name, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf0; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf0(plant, method)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, TReturnValue : Any?> _returnValueOf(plant: AssertionPlant<T>, method: KFunction0<TReturnValue>): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf0(plant, method)

@Deprecated("Use AssertImpl.feature.returnValueOf0; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf0(plant, method, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, TReturnValue : Any?> _method(plant: AssertionPlant<T>, name: String, method: () -> TReturnValue): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf0(plant, method, name)


//Arg1
@Deprecated("Use AssertImpl.feature.returnValueOf1; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf1(plant, method, arg1)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction1<T1, TReturnValue>, arg1: T1): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf1(plant, method, arg1)

@Deprecated("Use AssertImpl.feature.returnValueOf1; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf1(plant, method, arg1, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: (T1) -> TReturnValue, arg1: T1): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf1(plant, method, arg1, name)

@Deprecated("Use AssertImpl.feature.returnValueOf1; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf1(plant, method, arg1, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction1<T1, TReturnValue>, arg1: T1, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf1(plant, method, arg1, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf1; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf1(plant, method, arg1, name, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: (T1) -> TReturnValue, arg1: T1, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf1(plant, method, arg1, name, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf1; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf1(plant, method, arg1)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, TReturnValue : Any?> _returnValueOf(plant: AssertionPlant<T>, method: KFunction1<T1, TReturnValue>, arg1: T1): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf1(plant, method, arg1)

@Deprecated("Use AssertImpl.feature.returnValueOf1; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf1(plant, method, arg1, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, TReturnValue : Any?> _method(plant: AssertionPlant<T>, name: String, method: (T1) -> TReturnValue, arg1: T1): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf1(plant, method, arg1, name)


//Arg2
@Deprecated("Use AssertImpl.feature.returnValueOf2; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction2<T1, T2, TReturnValue>, arg1: T1, arg2: T2): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2)

@Deprecated("Use AssertImpl.feature.returnValueOf2; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2) -> TReturnValue, arg1: T1, arg2: T2): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2, name)

@Deprecated("Use AssertImpl.feature.returnValueOf2; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction2<T1, T2, TReturnValue>, arg1: T1, arg2: T2, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf2; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2, name, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2) -> TReturnValue, arg1: T1, arg2: T2, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2, name, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf2; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, TReturnValue : Any?> _returnValueOf(plant: AssertionPlant<T>, method: KFunction2<T1, T2, TReturnValue>, arg1: T1, arg2: T2): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2)

@Deprecated("Use AssertImpl.feature.returnValueOf2; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, TReturnValue : Any?> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2) -> TReturnValue, arg1: T1, arg2: T2): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf2(plant, method, arg1, arg2, name)


//Arg3
@Deprecated("Use AssertImpl.feature.returnValueOf3; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction3<T1, T2, T3, TReturnValue>, arg1: T1, arg2: T2, arg3: T3): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3)

@Deprecated("Use AssertImpl.feature.returnValueOf3; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2, T3) -> TReturnValue, arg1: T1, arg2: T2, arg3: T3): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3, name)

@Deprecated("Use AssertImpl.feature.returnValueOf3; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction3<T1, T2, T3, TReturnValue>, arg1: T1, arg2: T2, arg3: T3, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf3; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3, name, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2, T3) -> TReturnValue, arg1: T1, arg2: T2, arg3: T3, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3, name, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf3; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, TReturnValue : Any?> _returnValueOf(plant: AssertionPlant<T>, method: KFunction3<T1, T2, T3, TReturnValue>, arg1: T1, arg2: T2, arg3: T3): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3)

@Deprecated("Use AssertImpl.feature.returnValueOf3; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, TReturnValue : Any?> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2, T3) -> TReturnValue, arg1: T1, arg2: T2, arg3: T3): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf3(plant, method, arg1, arg2, arg3, name)


//Arg4
@Deprecated("Use AssertImpl.feature.returnValueOf4; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction4<T1, T2, T3, T4, TReturnValue>, arg1: T1, arg2: T2, arg3: T3, arg4: T4): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4)

@Deprecated("Use AssertImpl.feature.returnValueOf4; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2, T3, T4) -> TReturnValue, arg1: T1, arg2: T2, arg3: T3, arg4: T4): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4, name)

@Deprecated("Use AssertImpl.feature.returnValueOf4; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction4<T1, T2, T3, T4, TReturnValue>, arg1: T1, arg2: T2, arg3: T3, arg4: T4, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf4; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4, name, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2, T3, T4) -> TReturnValue, arg1: T1, arg2: T2, arg3: T3, arg4: T4, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4, name, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf4; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, TReturnValue : Any?> _returnValueOf(plant: AssertionPlant<T>, method: KFunction4<T1, T2, T3, T4, TReturnValue>, arg1: T1, arg2: T2, arg3: T3, arg4: T4): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4)

@Deprecated("Use AssertImpl.feature.returnValueOf4; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, TReturnValue : Any?> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2, T3, T4) -> TReturnValue, arg1: T1, arg2: T2, arg3: T3, arg4: T4): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf4(plant, method, arg1, arg2, arg3, arg4, name)


//Arg5
@Deprecated("Use AssertImpl.feature.returnValueOf5; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction5<T1, T2, T3, T4, T5, TReturnValue>, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5)

@Deprecated("Use AssertImpl.feature.returnValueOf5; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2, T3, T4, T5) -> TReturnValue, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5, name)

@Deprecated("Use AssertImpl.feature.returnValueOf5; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, TReturnValue : Any> _returnValueOf(plant: AssertionPlant<T>, method: KFunction5<T1, T2, T3, T4, T5, TReturnValue>, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf5; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5, name, assertionCreator)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, TReturnValue : Any> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2, T3, T4, T5) -> TReturnValue, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, assertionCreator: AssertionPlant<TReturnValue>.() -> Unit): AssertionPlant<TReturnValue>
    = AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5, name, assertionCreator)

@Deprecated("Use AssertImpl.feature.returnValueOf5; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, TReturnValue : Any?> _returnValueOf(plant: AssertionPlant<T>, method: KFunction5<T1, T2, T3, T4, T5, TReturnValue>, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5)

@Deprecated("Use AssertImpl.feature.returnValueOf5; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5, name)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any, T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, TReturnValue : Any?> _method(plant: AssertionPlant<T>, name: String, method: (T1, T2, T3, T4, T5) -> TReturnValue, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): AssertionPlantNullable<TReturnValue>
    = AssertImpl.feature.returnValueOf5(plant, method, arg1, arg2, arg3, arg4, arg5, name)
