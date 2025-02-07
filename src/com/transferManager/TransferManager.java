package com.transferManager;

import com.player.Player;

/**
 * Interface for transfer approval or rejection methods
 */
public interface TransferManager {
    /**
     * Interface method for approving player transfer
     * @param player Player that requested a transfer
     */
    public void approveTransfer(Player player);

    /**
     * Interface method for rejecting player transfer
     * @param player Player that requested a transfer
     */
    public void rejectTransfer(Player player);
}
