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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.migration;

import co.elastic.clients.elasticsearch.migration.deprecations.Deprecation;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: migration.deprecations.Response
@JsonpDeserializable
public class DeprecationsResponse implements JsonpSerializable {
	private final List<Deprecation> clusterSettings;

	private final Map<String, List<Deprecation>> indexSettings;

	private final List<Deprecation> nodeSettings;

	private final List<Deprecation> mlSettings;

	// ---------------------------------------------------------------------------------------------

	private DeprecationsResponse(Builder builder) {

		this.clusterSettings = ModelTypeHelper.unmodifiableRequired(builder.clusterSettings, this, "clusterSettings");
		this.indexSettings = ModelTypeHelper.unmodifiableRequired(builder.indexSettings, this, "indexSettings");
		this.nodeSettings = ModelTypeHelper.unmodifiableRequired(builder.nodeSettings, this, "nodeSettings");
		this.mlSettings = ModelTypeHelper.unmodifiableRequired(builder.mlSettings, this, "mlSettings");

	}

	public static DeprecationsResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code cluster_settings}
	 */
	public final List<Deprecation> clusterSettings() {
		return this.clusterSettings;
	}

	/**
	 * Required - API name: {@code index_settings}
	 */
	public final Map<String, List<Deprecation>> indexSettings() {
		return this.indexSettings;
	}

	/**
	 * Required - API name: {@code node_settings}
	 */
	public final List<Deprecation> nodeSettings() {
		return this.nodeSettings;
	}

	/**
	 * Required - API name: {@code ml_settings}
	 */
	public final List<Deprecation> mlSettings() {
		return this.mlSettings;
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

		if (ModelTypeHelper.isDefined(this.clusterSettings)) {
			generator.writeKey("cluster_settings");
			generator.writeStartArray();
			for (Deprecation item0 : this.clusterSettings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.indexSettings)) {
			generator.writeKey("index_settings");
			generator.writeStartObject();
			for (Map.Entry<String, List<Deprecation>> item0 : this.indexSettings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (Deprecation item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.nodeSettings)) {
			generator.writeKey("node_settings");
			generator.writeStartArray();
			for (Deprecation item0 : this.nodeSettings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.mlSettings)) {
			generator.writeKey("ml_settings");
			generator.writeStartArray();
			for (Deprecation item0 : this.mlSettings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeprecationsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeprecationsResponse> {
		private List<Deprecation> clusterSettings;

		private Map<String, List<Deprecation>> indexSettings;

		private List<Deprecation> nodeSettings;

		private List<Deprecation> mlSettings;

		/**
		 * Required - API name: {@code cluster_settings}
		 */
		public final Builder clusterSettings(List<Deprecation> value) {
			this.clusterSettings = value;
			return this;
		}

		/**
		 * Required - API name: {@code cluster_settings}
		 */
		public final Builder clusterSettings(Deprecation... value) {
			this.clusterSettings = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code cluster_settings}
		 */
		public final Builder clusterSettings(
				Function<ListBuilder<Deprecation, Deprecation.Builder>, ObjectBuilder<List<Deprecation>>> fn) {
			return clusterSettings(fn.apply(new ListBuilder<>(Deprecation.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code index_settings}
		 */
		public final Builder indexSettings(Map<String, List<Deprecation>> value) {
			this.indexSettings = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_settings}
		 */
		public final Builder nodeSettings(List<Deprecation> value) {
			this.nodeSettings = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_settings}
		 */
		public final Builder nodeSettings(Deprecation... value) {
			this.nodeSettings = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code node_settings}
		 */
		public final Builder nodeSettings(
				Function<ListBuilder<Deprecation, Deprecation.Builder>, ObjectBuilder<List<Deprecation>>> fn) {
			return nodeSettings(fn.apply(new ListBuilder<>(Deprecation.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code ml_settings}
		 */
		public final Builder mlSettings(List<Deprecation> value) {
			this.mlSettings = value;
			return this;
		}

		/**
		 * Required - API name: {@code ml_settings}
		 */
		public final Builder mlSettings(Deprecation... value) {
			this.mlSettings = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code ml_settings}
		 */
		public final Builder mlSettings(
				Function<ListBuilder<Deprecation, Deprecation.Builder>, ObjectBuilder<List<Deprecation>>> fn) {
			return mlSettings(fn.apply(new ListBuilder<>(Deprecation.Builder::new)).build());
		}

		/**
		 * Builds a {@link DeprecationsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeprecationsResponse build() {
			_checkSingleUse();

			return new DeprecationsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeprecationsResponse}
	 */
	public static final JsonpDeserializer<DeprecationsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeprecationsResponse::setupDeprecationsResponseDeserializer);

	protected static void setupDeprecationsResponseDeserializer(ObjectDeserializer<DeprecationsResponse.Builder> op) {

		op.add(Builder::clusterSettings, JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER),
				"cluster_settings");
		op.add(Builder::indexSettings,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER)),
				"index_settings");
		op.add(Builder::nodeSettings, JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER), "node_settings");
		op.add(Builder::mlSettings, JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER), "ml_settings");

	}

}
