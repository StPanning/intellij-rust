/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust

import org.rust.lang.core.macros.MacroExpansionScope

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class ExpandMacros(val mode: MacroExpansionScope = MacroExpansionScope.WORKSPACE, val cache: String = "")
