package islamapp.islamicapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class quran_list_view extends AppCompatActivity  {
    ListView listView;
    String[] quran_menu ={"Para 1","Para 2","Para 3","Para 4","Para 5","Para 6","Para 7","Para 8","Para 9","Para 10",
            "Para 11","Para 12","Para 13","Para 14","Para 15","Para 16","Para 17","Para 18","Para 19","Para 20",
            "Para 21","Para 22","Para 23","Para 24","Para 25","Para 26","Para 27","Para 28","Para 29","Para 30",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_list_view);
        listView = (ListView) findViewById(R.id.listView_quran);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, quran_menu);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(quran_list_view.this, Read_Quran.class);
                if (position==0)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para1_2","para1_3","para1_4","para1_5","para1_6","para1_7","para1_8","para1_9","para1_10","para1_11","para1_12","para1_13","para1_14","para1_15","para1_16","para1_17","para1_18","para1_19","para1_20"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }

                if (position==1)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para2_21","para2_22","para2_23","para2_24","para2_25","para2_26","para2_27","para2_28","para2_29","para2_30","para2_31","para2_32","para2_33","para2_34","para2_35","para2_36","para2_37","para2_38"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==2)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para3_39","para3_40","para3_41","para3_42","para3_43","para3_44","para3_45","para3_46","para3_47","para3_48","para3_49","para3_50","para3_51","para3_52","para3_53","para3_54","para3_55","para3_56"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }

                if (position==3)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para4_57","para4_58","para4_59","para4_60","para4_61","para4_62","para4_63","para4_64","para4_65","para4_66","para4_67","para4_68","para4_69","para4_70","para4_71","para4_72","para4_73","para4_74"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==4)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para5_75","para5_76","para5_77","para5_78","para5_79","para5_80","para5_81","para5_82","para5_83","para5_84","para5_85","para5_86","para5_87","para5_88","para5_89","para5_90","para5_91","para5_92",};
                    intent1.putExtra("imagearray", x);
                    startActivity(intent1);
                }
                if (position==5)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para6_93","para6_94","para6_95","para6_96","para6_97","para6_98","para6_99","para6_100","para6_101","para6_102","para6_103","para6_104","para6_105","para6_106","para6_107","para6_108","para6_109","para6_110"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==6)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para7_111","para7_112","para7_113","para7_114","para7_115","para7_116","para7_117","para7_118","para7_119","para7_120","para7_121","para7_122","para7_123","para7_124","para7_125","para7_126","para7_127","para7_128"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==7)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para8_129","para8_130","para8_131","para8_132","para8_133","para8_134","para8_135","para8_136","para8_137","para8_138","para8_139","para8_140","para8_141","para8_142","para8_143","para8_144","para8_145","para8_146"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==8)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para9_147","para9_148","para9_149","para9_150","para9_151","para9_152","para9_153","para9_154","para9_155","para9_156","para9_157","para9_158","para9_159","para9_160","para9_161","para9_162","para9_163","para9_164"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==9)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para10_165","para10_166","para10_167","para10_168","para10_169","para10_170","para10_171","para10_172","para10_173","para10_174","para10_175","para10_176","para10_177","para10_178","para10_179","para10_180","para10_181","para10_182"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==10)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para11_183","para11_184","para11_185","para11_186","para11_187","para11_188","para11_189","para11_190","para11_183","para11_183","para11_184","para11_185","para11_186","para11_187","para11_188","para11_189","para11_190","para11_191","para11_192","para11_193","para11_194","para11_195","para11_196","para11_197","para11_198","para11_199","para11_200"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==11)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para12_201","para12_202","para12_203","para12_204","para12_205","para12_206","para12_207","para12_208","para12_209","para12_210","para12_211","para12_212","para12_213","para12_214","para12_215","para12_216","para12_217","para12_218"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==12)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para13_219","para13_220","para13_221","para13_222","para13_223","para13_224","para13_225","para13_226","para13_227","para13_228","para13_229","para13_230","para13_231","para13_232","para13_233","para13_234","para13_235","para13_236"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==13)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para14_237","para14_238","para14_239","para14_240","para14_241","para14_242","para14_243","para14_244","para14_245","para14_246","para14_247","para14_248","para14_249","para14_250","para14_251","para14_252","para14_253","para14_254"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==14)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para15_255","para15_256","para15_257","para15_258","para15_259","para15_260","para15_261","para15_262","para15_263","para15_264","para15_265","para15_266","para15_267","para15_268","para15_269","para15_270","para15_271","para15_272"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==15)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para16_273","para16_274","para16_275","para16_276","para16_277","para16_278","para16_279","para16_280","para16_281","para16_282","para16_283","para16_284","para16_285","para16_286","para16_287","para16_288","para16_289","para16_290"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==16)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para17_291","para17_292","para17_293","para17_294","para17_295","para17_296","para17_297","para17_298","para17_299","para17_300","para17_301","para17_302","para17_303","para17_304","para17_305","para17_306","para17_307","para17_308"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==17)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para18_309","para18_310","para18_311","para18_312","para18_313","para18_314","para18_315","para18_316","para18_317","para18_318","para18_319","para18_320","para18_321","para18_322","para18_323","para18_324","para18_325","para18_326"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==18)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para19_327","para19_328","para19_329","para19_330","para19_331","para19_332","para19_333","para19_334","para19_335","para19_336","para19_337","para19_338","para19_339","para19_340","para19_341","para19_342","para19_343","para19_344"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==19)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para20_345","para20_346","para20_347","para20_348","para20_349","para20_350","para20_351","para20_352","para20_353","para20_354","para20_355","para20_356","para20_357","para20_358","para20_359","para20_360","para20_361","para20_362"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==20)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para21_363","para21_364","para21_365","para21_366","para21_367","para21_368","para21_369","para21_370","para21_371","para21_372","para21_373","para21_374","para21_375","para21_376","para21_377","para21_378","para21_379","para21_380"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==21)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para22_381","para22_382","para22_383","para22_384","para22_385","para22_386","para22_387","para22_388","para22_389","para22_390","para22_391","para22_392","para22_393","para22_394","para22_395","para22_396","para22_397","para22_398"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==22)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para23_399","para23_400","para23_401","para23_402","para23_403","para23_404","para23_405","para23_406","para23_407","para23_408","para23_409","para23_410","para23_411","para23_412","para23_413","para23_414","para23_415","para23_416"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==23)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para24_417","para24_418","para24_419","para24_420","para24_421","para24_422","para24_423","para24_424","para24_425","para24_426","para24_427","para24_428","para24_429","para24_430","para24_431","para24_432","para24_433","para24_434"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==24)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para25_435","para25_436","para25_437","para25_438","para25_439","para25_440","para25_441","para25_442","para25_443","para25_444","para25_445","para25_446","para25_447","para25_448","para25_449","para25_450","para25_451","para25_452"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==25)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para26_453","para26_454","para26_455","para26_456","para26_457","para26_458","para26_459","para26_460","para26_461","para26_462","para26_463","para26_464","para26_453","para26_465","para26_466","para26_467","para26_468","para26_469","para26_470"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==26)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para27_471","para27_472","para27_473","para27_474","para27_475","para27_476","para27_477","para27_478","para27_479","para27_480","para27_481","para27_482","para27_483","para27_484","para27_485","para27_486","para27_487","para27_488"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==27)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para28_489","para28_490","para28_491","para28_492","para28_493","para28_494","para28_495","para28_496","para28_497","para28_498","para28_499","para28_500","para28_501","para28_502","para28_503","para28_504","para28_505","para28_506","para28_507","para28_508"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==28)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para29_509","para29_510","para29_511","para29_512","para29_513","para29_514","para29_515","para29_516","para29_517","para29_518","para29_519","para29_520","para29_521","para29_522","para29_523","para29_524","para29_525","para29_526","para29_527","para29_528"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }
                if (position==29)
                {
                    Intent intent1 =new Intent(quran_list_view.this,Read_Quran.class);
                    String x[] = {"para30_529","para30_530","para30_531","para30_532","para30_533","para30_534","para30_535","para30_536","para30_537","para30_538","para30_539","para30_540","para30_541","para30_542","para30_543","para30_544","para30_545","para30_546","para30_547","para30_548","para30_549"};
                    intent1.putExtra("imagearray",x);
                    startActivity(intent1);
                }

            }



        });

    }
}
