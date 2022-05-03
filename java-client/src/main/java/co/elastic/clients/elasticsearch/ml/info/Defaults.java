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

package co.elastic.clients.elasticsearch.ml.info;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.info.Defaults

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ml.info.Defaults">API
 *      specification</a>
 */
@JsonpDeserializable
public class Defaults implements JsonpSerializable {
	private final AnomalyDetectors anomalyDetectors;

	private final Datafeeds datafeeds;

	// ---------------------------------------------------------------------------------------------

	private Defaults(Builder builder) {

		this.anomalyDetectors = ApiTypeHelper.requireNonNull(builder.anomalyDetectors, this, "anomalyDetectors");
		this.datafeeds = ApiTypeHelper.requireNonNull(builder.datafeeds, this, "datafeeds");

	}

	public static Defaults of(Function<Builder, ObjectBuilder<Defaults>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code anomaly_detectors}
	 */
	public final AnomalyDetectors anomalyDetectors() {
		return this.anomalyDetectors;
	}

	/**
	 * Required - API name: {@code datafeeds}
	 */
	public final Datafeeds datafeeds() {
		return this.datafeeds;
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

		generator.writeKey("anomaly_detectors");
		this.anomalyDetectors.serialize(generator, mapper);

		generator.writeKey("datafeeds");
		this.datafeeds.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Defaults}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Defaults> {
		private AnomalyDetectors anomalyDetectors;

		private Datafeeds datafeeds;

		/**
		 * Required - API name: {@code anomaly_detectors}
		 */
		public final Builder anomalyDetectors(AnomalyDetectors value) {
			this.anomalyDetectors = value;
			return this;
		}

		/**
		 * Required - API name: {@code anomaly_detectors}
		 */
		public final Builder anomalyDetectors(Function<AnomalyDetectors.Builder, ObjectBuilder<AnomalyDetectors>> fn) {
			return this.anomalyDetectors(fn.apply(new AnomalyDetectors.Builder()).build());
		}

		/**
		 * Required - API name: {@code datafeeds}
		 */
		public final Builder datafeeds(Datafeeds value) {
			this.datafeeds = value;
			return this;
		}

		/**
		 * Required - API name: {@code datafeeds}
		 */
		public final Builder datafeeds(Function<Datafeeds.Builder, ObjectBuilder<Datafeeds>> fn) {
			return this.datafeeds(fn.apply(new Datafeeds.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Defaults}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Defaults build() {
			_checkSingleUse();

			return new Defaults(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Defaults}
	 */
	public static final JsonpDeserializer<Defaults> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Defaults::setupDefaultsDeserializer);

	protected static void setupDefaultsDeserializer(ObjectDeserializer<Defaults.Builder> op) {

		op.add(Builder::anomalyDetectors, AnomalyDetectors._DESERIALIZER, "anomaly_detectors");
		op.add(Builder::datafeeds, Datafeeds._DESERIALIZER, "datafeeds");

	}

}
