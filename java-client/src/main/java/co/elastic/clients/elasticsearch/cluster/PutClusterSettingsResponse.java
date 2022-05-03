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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponse;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.put_settings.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cluster.put_settings.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutClusterSettingsResponse implements AcknowledgedResponse, JsonpSerializable {
	private final boolean acknowledged;

	private final Map<String, JsonData> persistent;

	private final Map<String, JsonData> transient_;

	// ---------------------------------------------------------------------------------------------

	private PutClusterSettingsResponse(Builder builder) {

		this.acknowledged = ApiTypeHelper.requireNonNull(builder.acknowledged, this, "acknowledged");
		this.persistent = ApiTypeHelper.unmodifiableRequired(builder.persistent, this, "persistent");
		this.transient_ = ApiTypeHelper.unmodifiableRequired(builder.transient_, this, "transient_");

	}

	public static PutClusterSettingsResponse of(Function<Builder, ObjectBuilder<PutClusterSettingsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code acknowledged}
	 */
	public final boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * Required - API name: {@code persistent}
	 */
	public final Map<String, JsonData> persistent() {
		return this.persistent;
	}

	/**
	 * Required - API name: {@code transient}
	 */
	public final Map<String, JsonData> transient_() {
		return this.transient_;
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

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		if (ApiTypeHelper.isDefined(this.persistent)) {
			generator.writeKey("persistent");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.persistent.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.transient_)) {
			generator.writeKey("transient");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.transient_.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutClusterSettingsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PutClusterSettingsResponse> {
		private Boolean acknowledged;

		private Map<String, JsonData> persistent;

		private Map<String, JsonData> transient_;

		/**
		 * Required - API name: {@code acknowledged}
		 */
		public final Builder acknowledged(boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * Required - API name: {@code persistent}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>persistent</code>.
		 */
		public final Builder persistent(Map<String, JsonData> map) {
			this.persistent = _mapPutAll(this.persistent, map);
			return this;
		}

		/**
		 * Required - API name: {@code persistent}
		 * <p>
		 * Adds an entry to <code>persistent</code>.
		 */
		public final Builder persistent(String key, JsonData value) {
			this.persistent = _mapPut(this.persistent, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code transient}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>transient_</code>.
		 */
		public final Builder transient_(Map<String, JsonData> map) {
			this.transient_ = _mapPutAll(this.transient_, map);
			return this;
		}

		/**
		 * Required - API name: {@code transient}
		 * <p>
		 * Adds an entry to <code>transient_</code>.
		 */
		public final Builder transient_(String key, JsonData value) {
			this.transient_ = _mapPut(this.transient_, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutClusterSettingsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutClusterSettingsResponse build() {
			_checkSingleUse();

			return new PutClusterSettingsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutClusterSettingsResponse}
	 */
	public static final JsonpDeserializer<PutClusterSettingsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutClusterSettingsResponse::setupPutClusterSettingsResponseDeserializer);

	protected static void setupPutClusterSettingsResponseDeserializer(
			ObjectDeserializer<PutClusterSettingsResponse.Builder> op) {

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::persistent, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "persistent");
		op.add(Builder::transient_, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "transient");

	}

}
