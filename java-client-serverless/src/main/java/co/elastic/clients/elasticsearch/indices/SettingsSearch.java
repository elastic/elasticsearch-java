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

// typedef: indices._types.SettingsSearch

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.SettingsSearch">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSearch implements JsonpSerializable {
	@Nullable
	private final SearchIdle idle;

	@Nullable
	private final SlowlogSettings slowlog;

	// ---------------------------------------------------------------------------------------------

	private SettingsSearch(Builder builder) {

		this.idle = builder.idle;
		this.slowlog = builder.slowlog;

	}

	public static SettingsSearch of(Function<Builder, ObjectBuilder<SettingsSearch>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code idle}
	 */
	@Nullable
	public final SearchIdle idle() {
		return this.idle;
	}

	/**
	 * API name: {@code slowlog}
	 */
	@Nullable
	public final SlowlogSettings slowlog() {
		return this.slowlog;
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

		if (this.idle != null) {
			generator.writeKey("idle");
			this.idle.serialize(generator, mapper);

		}
		if (this.slowlog != null) {
			generator.writeKey("slowlog");
			this.slowlog.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsSearch}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SettingsSearch> {
		@Nullable
		private SearchIdle idle;

		@Nullable
		private SlowlogSettings slowlog;

		/**
		 * API name: {@code idle}
		 */
		public final Builder idle(@Nullable SearchIdle value) {
			this.idle = value;
			return this;
		}

		/**
		 * API name: {@code idle}
		 */
		public final Builder idle(Function<SearchIdle.Builder, ObjectBuilder<SearchIdle>> fn) {
			return this.idle(fn.apply(new SearchIdle.Builder()).build());
		}

		/**
		 * API name: {@code slowlog}
		 */
		public final Builder slowlog(@Nullable SlowlogSettings value) {
			this.slowlog = value;
			return this;
		}

		/**
		 * API name: {@code slowlog}
		 */
		public final Builder slowlog(Function<SlowlogSettings.Builder, ObjectBuilder<SlowlogSettings>> fn) {
			return this.slowlog(fn.apply(new SlowlogSettings.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsSearch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsSearch build() {
			_checkSingleUse();

			return new SettingsSearch(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsSearch}
	 */
	public static final JsonpDeserializer<SettingsSearch> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SettingsSearch::setupSettingsSearchDeserializer);

	protected static void setupSettingsSearchDeserializer(ObjectDeserializer<SettingsSearch.Builder> op) {

		op.add(Builder::idle, SearchIdle._DESERIALIZER, "idle");
		op.add(Builder::slowlog, SlowlogSettings._DESERIALIZER, "slowlog");

	}

}
