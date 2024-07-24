/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.connector;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: connector._types.ConnectorFeatures

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.ConnectorFeatures">API
 *      specification</a>
 */
@JsonpDeserializable
public class ConnectorFeatures implements JsonpSerializable {
	@Nullable
	private final FeatureEnabled documentLevelSecurity;

	@Nullable
	private final FeatureEnabled incrementalSync;

	@Nullable
	private final FeatureEnabled nativeConnectorApiKeys;

	@Nullable
	private final SyncRulesFeature syncRules;

	// ---------------------------------------------------------------------------------------------

	private ConnectorFeatures(Builder builder) {

		this.documentLevelSecurity = builder.documentLevelSecurity;
		this.incrementalSync = builder.incrementalSync;
		this.nativeConnectorApiKeys = builder.nativeConnectorApiKeys;
		this.syncRules = builder.syncRules;

	}

	public static ConnectorFeatures of(Function<Builder, ObjectBuilder<ConnectorFeatures>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code document_level_security}
	 */
	@Nullable
	public final FeatureEnabled documentLevelSecurity() {
		return this.documentLevelSecurity;
	}

	/**
	 * API name: {@code incremental_sync}
	 */
	@Nullable
	public final FeatureEnabled incrementalSync() {
		return this.incrementalSync;
	}

	/**
	 * API name: {@code native_connector_api_keys}
	 */
	@Nullable
	public final FeatureEnabled nativeConnectorApiKeys() {
		return this.nativeConnectorApiKeys;
	}

	/**
	 * API name: {@code sync_rules}
	 */
	@Nullable
	public final SyncRulesFeature syncRules() {
		return this.syncRules;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.documentLevelSecurity != null) {
			generator.writeKey("document_level_security");
			this.documentLevelSecurity.serialize(generator, mapper);

		}
		if (this.incrementalSync != null) {
			generator.writeKey("incremental_sync");
			this.incrementalSync.serialize(generator, mapper);

		}
		if (this.nativeConnectorApiKeys != null) {
			generator.writeKey("native_connector_api_keys");
			this.nativeConnectorApiKeys.serialize(generator, mapper);

		}
		if (this.syncRules != null) {
			generator.writeKey("sync_rules");
			this.syncRules.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConnectorFeatures}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ConnectorFeatures> {
		@Nullable
		private FeatureEnabled documentLevelSecurity;

		@Nullable
		private FeatureEnabled incrementalSync;

		@Nullable
		private FeatureEnabled nativeConnectorApiKeys;

		@Nullable
		private SyncRulesFeature syncRules;

		/**
		 * API name: {@code document_level_security}
		 */
		public final Builder documentLevelSecurity(@Nullable FeatureEnabled value) {
			this.documentLevelSecurity = value;
			return this;
		}

		/**
		 * API name: {@code document_level_security}
		 */
		public final Builder documentLevelSecurity(Function<FeatureEnabled.Builder, ObjectBuilder<FeatureEnabled>> fn) {
			return this.documentLevelSecurity(fn.apply(new FeatureEnabled.Builder()).build());
		}

		/**
		 * API name: {@code incremental_sync}
		 */
		public final Builder incrementalSync(@Nullable FeatureEnabled value) {
			this.incrementalSync = value;
			return this;
		}

		/**
		 * API name: {@code incremental_sync}
		 */
		public final Builder incrementalSync(Function<FeatureEnabled.Builder, ObjectBuilder<FeatureEnabled>> fn) {
			return this.incrementalSync(fn.apply(new FeatureEnabled.Builder()).build());
		}

		/**
		 * API name: {@code native_connector_api_keys}
		 */
		public final Builder nativeConnectorApiKeys(@Nullable FeatureEnabled value) {
			this.nativeConnectorApiKeys = value;
			return this;
		}

		/**
		 * API name: {@code native_connector_api_keys}
		 */
		public final Builder nativeConnectorApiKeys(
				Function<FeatureEnabled.Builder, ObjectBuilder<FeatureEnabled>> fn) {
			return this.nativeConnectorApiKeys(fn.apply(new FeatureEnabled.Builder()).build());
		}

		/**
		 * API name: {@code sync_rules}
		 */
		public final Builder syncRules(@Nullable SyncRulesFeature value) {
			this.syncRules = value;
			return this;
		}

		/**
		 * API name: {@code sync_rules}
		 */
		public final Builder syncRules(Function<SyncRulesFeature.Builder, ObjectBuilder<SyncRulesFeature>> fn) {
			return this.syncRules(fn.apply(new SyncRulesFeature.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ConnectorFeatures}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConnectorFeatures build() {
			_checkSingleUse();

			return new ConnectorFeatures(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ConnectorFeatures}
	 */
	public static final JsonpDeserializer<ConnectorFeatures> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ConnectorFeatures::setupConnectorFeaturesDeserializer);

	protected static void setupConnectorFeaturesDeserializer(ObjectDeserializer<ConnectorFeatures.Builder> op) {

		op.add(Builder::documentLevelSecurity, FeatureEnabled._DESERIALIZER, "document_level_security");
		op.add(Builder::incrementalSync, FeatureEnabled._DESERIALIZER, "incremental_sync");
		op.add(Builder::nativeConnectorApiKeys, FeatureEnabled._DESERIALIZER, "native_connector_api_keys");
		op.add(Builder::syncRules, SyncRulesFeature._DESERIALIZER, "sync_rules");

	}

}
