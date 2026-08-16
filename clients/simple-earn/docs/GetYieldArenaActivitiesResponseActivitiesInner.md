

# GetYieldArenaActivitiesResponseActivitiesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activityId** | **Long** | Activity ID. |  [optional] |
|**activityType** | **String** | Activity category: &#x60;AIRDROP&#x60;, &#x60;LEADERBOARD&#x60;, or &#x60;EVENT&#x60;. |  [optional] |
|**title** | **String** | Activity title, localized via the &#x60;lang&#x60; header. |  [optional] |
|**description** | **String** | Activity description, localized via the &#x60;lang&#x60; header. |  [optional] |
|**rewardPoolInUsd** | **String** | USD value of the reward pool. |  [optional] |
|**rewardToken** | **List&lt;String&gt;** | Reward token symbols (e.g. &#x60;[\&quot;BNB\&quot;]&#x60;); may be empty. |  [optional] |
|**redirectUrl** | **String** | Web URL to the activity landing page. |  [optional] |
|**startTime** | **Long** | Activity start time in milliseconds; may be null for activities that are immediately effective. |  [optional] |
|**endTime** | **Long** | Activity end time in milliseconds; may be null for activities with no fixed end. |  [optional] |



