package com.transferManager;

import com.player.Player;

/**
 * Interface for transfer approval or rejection methods
 */
public interface TransferManager {
    public void approveTransfer(Player player);
    public void rejectTransfer(Player player);
}
