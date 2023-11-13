/*
* コピーライト 2023 Kevin Wang
*
* Apache License バージョン 2.0 (「ライセンス」) に基づいてライセンスされています。 ライセンス
* に準拠する場合を除き、このファイルを使用することはできません。 ライセンスのコピーは
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* で入手できます。
*
* 適用される法律で義務付けられている場合または書面による同意がない限り、ライセンスに基づいて配布される
* ソフトウェアは、明示または黙示を問わず、いかなる種類の保証や条件もなく、「現状のまま」で配布されます。
* ライセンスに基づく許可と制限を規定する特定の言語については、ライセンスを参照してください。
* */
/*
* 2023年 11月 2日
* 次のプログラムは、サイズ 10 の配列を 2 つ作成し、1 つにユーザー入力を軽蔑する
* 両方のリストの対応するセルの合計が 25 になるように 2 番目のリストに値を入れます。
 */
package hw.e21;

import java.util.Scanner;

public class 同じ額 {
    public static void main(String[] args) {
        // オブジェクトを初期化する
        // 配列サイズ -> hairetsu saizu
        final int 配列サイズ = 10;
        int[] リスト１ = new int[配列サイズ];
        int[] リスト２ = new int[配列サイズ];
        Scanner スク = new Scanner(System.in);

        // ユーザーに最初のリストの値を尋ねる
        for (int い = 0; い < 配列サイズ; い++) {
            System.out.printf("%dの値を入力します: ", い + 1);
            リスト１[い] = スク.nextInt();
        }

        // a + b = 25, b = 25 - a
        // 2 番目のリストの値を計算して保存する
        for (int い = 0; い < 配列サイズ; い++) {
            リスト２[い] = 25 - リスト１[い];
        }

        // 両方の配列の値をユーザーに返します
        System.out.print("リスト１: [");
        for (int い = 0; い < 配列サイズ - 1; い++) {
            System.out.printf("%d, ", リスト１[い]);
        }
        System.out.printf("%d]", リスト１[配列サイズ - 1]);

        // 2 つの配列を区切るために新しい行を出力する必要があります
        System.out.println();

        System.out.print("リスト２: [");
        for (int い = 0; い < 配列サイズ - い; い++) {
            System.out.printf("%d, ", リスト２[い]);
        }
        System.out.printf("%d]", リスト２[配列サイズ - 1]);
    }
}
