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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: indices._types.RetentionLease

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.RetentionLease">API
 *      specification</a>
 */
@JsonpDeserializable
public class RetentionLease implements JsonpSerializable {
	private final Time period;

	// ---------------------------------------------------------------------------------------------

	private RetentionLease(Builder builder) {

		this.period = ApiTypeHelper.requireNonNull(builder.period, this, "period");

	}

	public static RetentionLease of(Function<Builder, ObjectBuilder<RetentionLease>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code period}
	 */
	public final Time period() {
		return this.period;
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

		generator.writeKey("period");
		this.period.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RetentionLease}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RetentionLease> {
		private Time period;

		/**
		 * Required - API name: {@code period}
		 */
		public final Builder period(Time value) {
			this.period = value;
			return this;
		}

		/**
		 * Required - API name: {@code period}
		 */
		public final Builder period(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.period(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RetentionLease}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RetentionLease build() {
			_checkSingleUse();

			return new RetentionLease(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RetentionLease}
	 */
	public static final JsonpDeserializer<RetentionLease> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RetentionLease::setupRetentionLeaseDeserializer);

	protected static void setupRetentionLeaseDeserializer(ObjectDeserializer<RetentionLease.Builder> op) {

		op.add(Builder::period, Time._DESERIALIZER, "period");

	}

}
