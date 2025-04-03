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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
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

// typedef: watcher._types.AcknowledgeState

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.AcknowledgeState">API
 *      specification</a>
 */
@JsonpDeserializable
public class AcknowledgeState implements JsonpSerializable {
	private final AcknowledgementOptions state;

	private final DateTime timestamp;

	// ---------------------------------------------------------------------------------------------

	private AcknowledgeState(Builder builder) {

		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static AcknowledgeState of(Function<Builder, ObjectBuilder<AcknowledgeState>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final AcknowledgementOptions state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final DateTime timestamp() {
		return this.timestamp;
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

		generator.writeKey("state");
		this.state.serialize(generator, mapper);
		generator.writeKey("timestamp");
		this.timestamp.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AcknowledgeState}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AcknowledgeState> {
		private AcknowledgementOptions state;

		private DateTime timestamp;

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(AcknowledgementOptions value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(DateTime value) {
			this.timestamp = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AcknowledgeState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AcknowledgeState build() {
			_checkSingleUse();

			return new AcknowledgeState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AcknowledgeState}
	 */
	public static final JsonpDeserializer<AcknowledgeState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AcknowledgeState::setupAcknowledgeStateDeserializer);

	protected static void setupAcknowledgeStateDeserializer(ObjectDeserializer<AcknowledgeState.Builder> op) {

		op.add(Builder::state, AcknowledgementOptions._DESERIALIZER, "state");
		op.add(Builder::timestamp, DateTime._DESERIALIZER, "timestamp");

	}

}
