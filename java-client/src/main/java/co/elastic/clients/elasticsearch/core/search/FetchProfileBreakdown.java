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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.FetchProfileBreakdown
@JsonpDeserializable
public class FetchProfileBreakdown implements JsonpSerializable {
	@Nullable
	private final Integer loadStoredFields;

	@Nullable
	private final Integer loadStoredFieldsCount;

	@Nullable
	private final Integer nextReader;

	@Nullable
	private final Integer nextReaderCount;

	@Nullable
	private final Integer processCount;

	@Nullable
	private final Integer process;

	// ---------------------------------------------------------------------------------------------

	private FetchProfileBreakdown(Builder builder) {

		this.loadStoredFields = builder.loadStoredFields;
		this.loadStoredFieldsCount = builder.loadStoredFieldsCount;
		this.nextReader = builder.nextReader;
		this.nextReaderCount = builder.nextReaderCount;
		this.processCount = builder.processCount;
		this.process = builder.process;

	}

	public static FetchProfileBreakdown of(Function<Builder, ObjectBuilder<FetchProfileBreakdown>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code load_stored_fields}
	 */
	@Nullable
	public final Integer loadStoredFields() {
		return this.loadStoredFields;
	}

	/**
	 * API name: {@code load_stored_fields_count}
	 */
	@Nullable
	public final Integer loadStoredFieldsCount() {
		return this.loadStoredFieldsCount;
	}

	/**
	 * API name: {@code next_reader}
	 */
	@Nullable
	public final Integer nextReader() {
		return this.nextReader;
	}

	/**
	 * API name: {@code next_reader_count}
	 */
	@Nullable
	public final Integer nextReaderCount() {
		return this.nextReaderCount;
	}

	/**
	 * API name: {@code process_count}
	 */
	@Nullable
	public final Integer processCount() {
		return this.processCount;
	}

	/**
	 * API name: {@code process}
	 */
	@Nullable
	public final Integer process() {
		return this.process;
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

		if (this.loadStoredFields != null) {
			generator.writeKey("load_stored_fields");
			generator.write(this.loadStoredFields);

		}
		if (this.loadStoredFieldsCount != null) {
			generator.writeKey("load_stored_fields_count");
			generator.write(this.loadStoredFieldsCount);

		}
		if (this.nextReader != null) {
			generator.writeKey("next_reader");
			generator.write(this.nextReader);

		}
		if (this.nextReaderCount != null) {
			generator.writeKey("next_reader_count");
			generator.write(this.nextReaderCount);

		}
		if (this.processCount != null) {
			generator.writeKey("process_count");
			generator.write(this.processCount);

		}
		if (this.process != null) {
			generator.writeKey("process");
			generator.write(this.process);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FetchProfileBreakdown}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FetchProfileBreakdown> {
		@Nullable
		private Integer loadStoredFields;

		@Nullable
		private Integer loadStoredFieldsCount;

		@Nullable
		private Integer nextReader;

		@Nullable
		private Integer nextReaderCount;

		@Nullable
		private Integer processCount;

		@Nullable
		private Integer process;

		/**
		 * API name: {@code load_stored_fields}
		 */
		public final Builder loadStoredFields(@Nullable Integer value) {
			this.loadStoredFields = value;
			return this;
		}

		/**
		 * API name: {@code load_stored_fields_count}
		 */
		public final Builder loadStoredFieldsCount(@Nullable Integer value) {
			this.loadStoredFieldsCount = value;
			return this;
		}

		/**
		 * API name: {@code next_reader}
		 */
		public final Builder nextReader(@Nullable Integer value) {
			this.nextReader = value;
			return this;
		}

		/**
		 * API name: {@code next_reader_count}
		 */
		public final Builder nextReaderCount(@Nullable Integer value) {
			this.nextReaderCount = value;
			return this;
		}

		/**
		 * API name: {@code process_count}
		 */
		public final Builder processCount(@Nullable Integer value) {
			this.processCount = value;
			return this;
		}

		/**
		 * API name: {@code process}
		 */
		public final Builder process(@Nullable Integer value) {
			this.process = value;
			return this;
		}

		/**
		 * Builds a {@link FetchProfileBreakdown}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FetchProfileBreakdown build() {
			_checkSingleUse();

			return new FetchProfileBreakdown(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FetchProfileBreakdown}
	 */
	public static final JsonpDeserializer<FetchProfileBreakdown> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FetchProfileBreakdown::setupFetchProfileBreakdownDeserializer, Builder::build);

	protected static void setupFetchProfileBreakdownDeserializer(
			DelegatingDeserializer<FetchProfileBreakdown.Builder> op) {

		op.add(Builder::loadStoredFields, JsonpDeserializer.integerDeserializer(), "load_stored_fields");
		op.add(Builder::loadStoredFieldsCount, JsonpDeserializer.integerDeserializer(), "load_stored_fields_count");
		op.add(Builder::nextReader, JsonpDeserializer.integerDeserializer(), "next_reader");
		op.add(Builder::nextReaderCount, JsonpDeserializer.integerDeserializer(), "next_reader_count");
		op.add(Builder::processCount, JsonpDeserializer.integerDeserializer(), "process_count");
		op.add(Builder::process, JsonpDeserializer.integerDeserializer(), "process");

	}

}
