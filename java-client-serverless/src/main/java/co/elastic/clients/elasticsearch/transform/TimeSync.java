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

package co.elastic.clients.elasticsearch.transform;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.TimeSync

/**
 *
 * @see <a href="../doc-files/api-spec.html#transform._types.TimeSync">API
 *      specification</a>
 */
@JsonpDeserializable
public class TimeSync implements SyncVariant, JsonpSerializable {
	@Nullable
	private final Time delay;

	private final String field;

	// ---------------------------------------------------------------------------------------------

	private TimeSync(Builder builder) {

		this.delay = builder.delay;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

	}

	public static TimeSync of(Function<Builder, ObjectBuilder<TimeSync>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Sync variant kind.
	 */
	@Override
	public Sync.Kind _syncKind() {
		return Sync.Kind.Time;
	}

	/**
	 * The time delay between the current time and the latest input data time.
	 * <p>
	 * API name: {@code delay}
	 */
	@Nullable
	public final Time delay() {
		return this.delay;
	}

	/**
	 * Required - The date field that is used to identify new documents in the
	 * source. In general, it’s a good idea to use a field that contains the ingest
	 * timestamp. If you use a different field, you might need to set the delay such
	 * that it accounts for data transmission delays.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
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

		if (this.delay != null) {
			generator.writeKey("delay");
			this.delay.serialize(generator, mapper);

		}
		generator.writeKey("field");
		generator.write(this.field);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimeSync}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TimeSync> {
		@Nullable
		private Time delay;

		private String field;

		/**
		 * The time delay between the current time and the latest input data time.
		 * <p>
		 * API name: {@code delay}
		 */
		public final Builder delay(@Nullable Time value) {
			this.delay = value;
			return this;
		}

		/**
		 * The time delay between the current time and the latest input data time.
		 * <p>
		 * API name: {@code delay}
		 */
		public final Builder delay(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.delay(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The date field that is used to identify new documents in the
		 * source. In general, it’s a good idea to use a field that contains the ingest
		 * timestamp. If you use a different field, you might need to set the delay such
		 * that it accounts for data transmission delays.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TimeSync}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TimeSync build() {
			_checkSingleUse();

			return new TimeSync(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TimeSync}
	 */
	public static final JsonpDeserializer<TimeSync> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TimeSync::setupTimeSyncDeserializer);

	protected static void setupTimeSyncDeserializer(ObjectDeserializer<TimeSync.Builder> op) {

		op.add(Builder::delay, Time._DESERIALIZER, "delay");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");

	}

}
