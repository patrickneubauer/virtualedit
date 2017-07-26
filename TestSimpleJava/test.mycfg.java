#textdomain wesnoth
 #ifdef TITLE_SCREEN
 #define NO_TERRAIN_GFX
 #enddef
 #endif
 #ifdef NO_GUI
 #define NO_TERRAIN_GFX
 #enddef
 #endif
 { english "." cfg } { themes "/" } { core "/" } [ multiplayer_side ] id = Custom 
 name = "_" Custom 
 image = "units/unknown-unit.png" 
 [/ multiplayer_side ] #ifdef MULTIPLAYER
 { multiplayer "/" } #ifdef MP_TEST
 { test "/" multiplayer "/" } #endif
 #endif
 { eras "." cfg } { campaigns "/" } [ ais ] [ default_config ] { ai "/" utils "/" default_config "." cfg } [/ default_config ] { ai "/" ais "/" } #ifdef DEBUG_MODE
 { ai "/" dev "/" } #endif
 [/ ais ] #ifdef EDITOR
 [ textdomain ] name = wesnoth-editor 
 [/ textdomain ] #endif
 #ifdef TEST
 { scenario-test "." cfg } { scenario-leaders "." cfg } { scenario-movethrough "." cfg } { ai "/" scenarios "/" } { ai "/" micro_ais "/" scenarios "/" } #define DONT_RELOAD_CORE
 #enddef
 { test "/" } #endif
 [ textdomain ] name = wesnoth 
 [/ textdomain ] [ textdomain ] name = wesnoth-help 
 [/ textdomain ] [ textdomain ] name = wesnoth-ai 
 [/ textdomain ] [ textdomain ] name = wesnoth-units 
 [/ textdomain ] [ textdomain ] name = wesnoth-multiplayer 
 [/ textdomain ] [ textdomain ] name = wesnoth-anl 
 [/ textdomain ] #ifndef NO_TERRAIN_GFX
 { core "/" terrain-graphics "." cfg } #endif
 [ binary_path ] path = data "/" core 
 [/ binary_path ] { advanced_preferences "." cfg } { game_config "." cfg } [ textdomain ] name = wesnoth-lib 
 [/ textdomain ]