package com.eyupyilmaz.kotlinbasicfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList : ArrayList<FoodItem>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.foodRV)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(FoodItem(R.drawable.baklava, "Baklava","Türk, Orta Doğu, Balkan ve Güney Asya mutfaklarında yer etmiş önemli bir hamur tatlısıdır. İnce yufkaların arasına yöreye göre ceviz, antep fıstığı, badem veya fındık konarak yapılır. Genel olarak şeker şerbeti ile tatlandırılır. Ayrıca bal şerbeti de kullanılabilir. Bazı ticari firmalar kendi özel şerbetlerini kullanırlar."))
        foodList.add(FoodItem(R.drawable.boorekk, "Börek","Börek, yufkanın yuvarlama, doldurma ve/veya katlama işlemleri ile hazırlanan, yapımında yaygın olarak beyaz peynir, ıspanak, kıyma, patates gibi çok değişik iç harcı kullanılan, katmanlanmış lezzetli hamur işi. Bazı yörelerde yufkasız olarak yapılan bazı yemeklere de börek denilmektedir. "))
        foodList.add(FoodItem(R.drawable.cig_kofte, "Çiğ Köfte","Çiğ köfte; bulgur, isot, kıyılmış et, salça, soğan, maydanoz ve çeşitli baharatların yoğurulup karıştırılması ile hazırlanan, ısıl işlem görmeden (pişirilmeden) tüketilen, Şanlıurfa ve Adıyaman yöresine ait bir yiyecektir."))
        foodList.add(FoodItem(R.drawable.dolmaa, "Dolma","Dolma, Balkan, Güney Kafkasya, Orta Asya, Akdeniz, Ege ve Orta Doğu mutfaklarında yeri olan bir yemek çeşididir. Biber, domates, soğan, patlıcan ve kabak gibi sebzelerden yapılmaktadır. 2017 yılında Azerbaycan'ın \"Dolma yapımı ve paylaşımı geleneği\" UNESCO Somut Olmayan Kültürel Miras Listelerine dahil edilmiştir."))
        foodList.add(FoodItem(R.drawable.doner, "Döner","Döner, içyağı ve yöresel baharatlarla iyice terbiyelenmiş ve dövülmüş et parçalarının, bir şişin üzerine geçirilerek, dik bir şekilde asıldıkları odun ateşi karşısında pişirildiği, Türk mutfağına özgü bir yemek."))
        foodList.add(FoodItem(R.drawable.fellah_koftee01, "Fellah Köfte","Döner, içyağı ve yöresel baharatlarla iyice terbiyelenmiş ve dövülmüş et parçalarının, bir şişin üzerine geçirilerek, dik bir şekilde asıldıkları odun ateşi karşısında pişirildiği, Türk mutfağına özgü bir yemek."))
        foodList.add(FoodItem(R.drawable.icli_koftee, "İçli Köfte","Aslen Levant mutfağına ait olan bu yemeğe kibbe ve bazı yörelerde dolgulu köfte de deniliyor. İçli köfte, iki türlü hazırlanır. Bunlardan birincisi haşlama usulüdür. Bayram, söz, nişan, kına gecesi gibi özel günler ile misafir ağırlamada mutlaka sofradaki yerini alır."))
        foodList.add(FoodItem(R.drawable.imam_bayildi, "İmam Bayıldı","Aslen Levant mutfağına ait olan bu yemeğe kibbe ve bazı yörelerde dolgulu köfte de deniliyor. İçli köfte, iki türlü hazırlanır. Bunlardan birincisi haşlama usulüdür. Bayram, söz, nişan, kına gecesi gibi özel günler ile misafir ağırlamada mutlaka sofradaki yerini alır."))
        foodList.add(FoodItem(R.drawable.iskender_kebab, "İskender Kebab","İskender kebap , iskender döner veya Bursa Kebabı; Bursa yöresinin meşhur kebap yemeklerinden biridir. 1867 yılında Kayhan Çarşısı'nda başlamıştır. Aslında temel malzemesi döner olsa da iskenderi iskender yapan, üstündeki tereyağ, domates sosu, yanındaki yoğurt ve altındaki yağlı pide parçalarıdır."))
        foodList.add(FoodItem(R.drawable.kisirr, "Kısır","Kısır veya bulgur salatası; ana bileşeni bulgur, salça, domates, maydanoz ve sarımsak olan, kimi yörelerde (örneğin Antakya) nar ekşisi de eklenerek yapılan Türk ve Kürt mutfağında bir soğuk yemek veya meze türü."))
        foodList.add(FoodItem(R.drawable.kofte, "Köfte","Kısır veya bulgur salatası; ana bileşeni bulgur, salça, domates, maydanoz ve sarımsak olan, kimi yörelerde (örneğin Antakya) nar ekşisi de eklenerek yapılan Türk ve Kürt mutfağında bir soğuk yemek veya meze türü."))
        foodList.add(FoodItem(R.drawable.lahmacun, "Lahmacun","Lahmacun, açılmış hamurun üzerine kıyma, maydanoz, soğan, sarımsak, karabiber ve isot (kırmızı biber) gibi baharatlarla hazırlanan malzeme sürüldükten sonra taş fırında pişirilmesiyle yapılan Orta Doğu mutfağında bir çeşit içli pidedir."))
        foodList.add(FoodItem(R.drawable.manti, "Mantı","Mantı, çeşitli baharatlarla çeşnilendirilen kıymanın, küçük hamur parçalarının içine konulması ve bu hamur parçalarının suda haşlanması ile yapılan yemektir. Türk mutfağının olduğu kadar Orta Asya mutfaklarının da bir parçası olan mantı, eski SSCB ülkelerinde de popüler bir yiyecektir. Ayrıca Afganistan, Balkanlar, Kuzeybatı Çin ve Pakistan'ın Peşaver şehrinde de mantı tüketilmektedir."))
        foodList.add(FoodItem(R.drawable.menemen, "Menemen","Menemen, yumurta, biber, domates ve isteğe bağlı olarak soğan kullanılarak yapılan bir Türk yemeğidir. İlk kez mübadele ile İzmir'in Menemen ilçesine gelen Girit Türkleri tarafından yapılmıştır ve adını ilçeden almaktadır."))
        foodList.add(FoodItem(R.drawable.pide, "Pide","Menemen, yumurta, biber, domates ve isteğe bağlı olarak soğan kullanılarak yapılan bir Türk yemeğidir. İlk kez mübadele ile İzmir'in Menemen ilçesine gelen Girit Türkleri tarafından yapılmıştır ve adını ilçeden almaktadır."))
        foodList.add(FoodItem(R.drawable.yaglama_kayserii, "Kayseri Yağlama","Yağlama, şebit, kıyma, salçalı sos ve yoğurttan oluşan bir yemektir. Şebitlerin (yufka) üst üste konup, her katın arasına bol sulu ve salçalı kıymanın konmasıyla yapılır."))

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

        foodAdapter.onItemClick = {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("food", it)
            startActivity(intent)
        }
    }
}