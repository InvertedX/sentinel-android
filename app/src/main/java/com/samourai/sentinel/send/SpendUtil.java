package com.samourai.sentinel.send;

import android.content.Context;


import com.samourai.sentinel.sweep.MyTransactionOutPoint;
import com.samourai.sentinel.sweep.UTXO;
import com.samourai.sentinel.util.FormatsUtil;

import org.bitcoinj.core.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SpendUtil {

    public static List<UTXO> getUTXOS(Context context, String address, long neededAmount, int account) {
        List<UTXO> utxos = null;
//        if (account == WhirlpoolMeta.getInstance(context).getWhirlpoolPostmix()) {
//            if (UTXOFactory.getInstance().getTotalPostMix() > neededAmount) {
//                HashMap<String, UTXO> postmix = UTXOFactory.getInstance().getAllPostMix();
//                utxos = new ArrayList<>();
//                //Filtering out do not spends
//                for (String key : postmix.keySet()) {
//                    UTXO u = new UTXO();
//                    for (MyTransactionOutPoint out : postmix.get(key).getOutpoints()) {
//                        if (!BlockedUTXO.getInstance().contains(out.getTxHash().toString(), out.getTxOutputN())) {
//                            u.getOutpoints().add(out);
//                            u.setPath(postmix.get(key).getPath());
//                        }
//                    }
//                    if (u.getOutpoints().size() > 0) {
//                        utxos.add(u);
//                    }
//                }
//            } else {
//                return null;
//            }
//        } else

//        if (FormatsUtil.getInstance().isValidBech32(address) && (UTXOFactory.getInstance().getAllP2WPKH().size() > 0 && UTXOFactory.getInstance().getTotalP2WPKH() > neededAmount)) {
//            utxos = new ArrayList<UTXO>(UTXOFactory.getInstance().getAllP2WPKH().values());
////                    Log.d("SendActivity", "segwit utxos:" + utxos.size());
//        } else if (!FormatsUtil.getInstance().isValidBech32(address) && Address.fromBase58(SentinelState.Companion.getNetworkParam(), address).isP2SHAddress() && (UTXOFactory.getInstance().getAllP2SH_P2WPKH().size() > 0 && UTXOFactory.getInstance().getTotalP2SH_P2WPKH() > neededAmount)) {
//            utxos = new ArrayList<UTXO>(UTXOFactory.getInstance().getAllP2SH_P2WPKH().values());
////                    Log.d("SendActivity", "segwit utxos:" + utxos.size());
//        } else if ((!FormatsUtil.getInstance().isValidBech32(address) && !Address.fromBase58(SentinelState.Companion.getNetworkParam(), address).isP2SHAddress()) && (UTXOFactory.getInstance().getAllP2PKH().size() > 0) && (UTXOFactory.getInstance().getTotalP2PKH() > neededAmount)) {
//            utxos = new ArrayList<UTXO>(UTXOFactory.getInstance().getAllP2PKH().values());
////                    Log.d("SendActivity", "p2pkh utxos:" + utxos.size());
//        } else {
//            utxos = APIFactory.getInstance(context).getUtxos();
////                    Log.d("SendActivity", "all filtered utxos:" + utxos.size());
//        }
//        utxos = APIFactory.getInstance(context).getUtxos();

        return utxos;
    }
}
