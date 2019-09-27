#!/usr/bin/env groovy
package com.binpipe

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.binpipe.GlobalVars
   // println GlobalVars.foo
}
