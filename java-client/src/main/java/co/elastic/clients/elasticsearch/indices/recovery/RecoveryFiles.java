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

package co.elastic.clients.elasticsearch.indices.recovery;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.recovery.RecoveryFiles
public final class RecoveryFiles implements JsonpSerializable {
	@Nullable
	private final List<FileDetails> details;

	private final JsonValue percent;

	private final Number recovered;

	private final Number reused;

	private final Number total;

	// ---------------------------------------------------------------------------------------------

	public RecoveryFiles(Builder builder) {

		this.details = builder.details;
		this.percent = Objects.requireNonNull(builder.percent, "percent");
		this.recovered = Objects.requireNonNull(builder.recovered, "recovered");
		this.reused = Objects.requireNonNull(builder.reused, "reused");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	/**
	 * API name: {@code details}
	 */
	@Nullable
	public List<FileDetails> details() {
		return this.details;
	}

	/**
	 * API name: {@code percent}
	 */
	public JsonValue percent() {
		return this.percent;
	}

	/**
	 * API name: {@code recovered}
	 */
	public Number recovered() {
		return this.recovered;
	}

	/**
	 * API name: {@code reused}
	 */
	public Number reused() {
		return this.reused;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
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

		if (this.details != null) {

			generator.writeKey("details");
			generator.writeStartArray();
			for (FileDetails item0 : this.details) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("percent");
		generator.write(this.percent);

		generator.writeKey("recovered");
		generator.write(this.recovered.doubleValue());

		generator.writeKey("reused");
		generator.write(this.reused.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryFiles}.
	 */
	public static class Builder implements ObjectBuilder<RecoveryFiles> {
		@Nullable
		private List<FileDetails> details;

		private JsonValue percent;

		private Number recovered;

		private Number reused;

		private Number total;

		/**
		 * API name: {@code details}
		 */
		public Builder details(@Nullable List<FileDetails> value) {
			this.details = value;
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public Builder details(FileDetails... value) {
			this.details = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #details(List)}, creating the list if needed.
		 */
		public Builder addDetails(FileDetails value) {
			if (this.details == null) {
				this.details = new ArrayList<>();
			}
			this.details.add(value);
			return this;
		}

		/**
		 * Set {@link #details(List)} to a singleton list.
		 */
		public Builder details(Function<FileDetails.Builder, ObjectBuilder<FileDetails>> fn) {
			return this.details(fn.apply(new FileDetails.Builder()).build());
		}

		/**
		 * Add a value to {@link #details(List)}, creating the list if needed.
		 */
		public Builder addDetails(Function<FileDetails.Builder, ObjectBuilder<FileDetails>> fn) {
			return this.addDetails(fn.apply(new FileDetails.Builder()).build());
		}

		/**
		 * API name: {@code percent}
		 */
		public Builder percent(JsonValue value) {
			this.percent = value;
			return this;
		}

		/**
		 * API name: {@code recovered}
		 */
		public Builder recovered(Number value) {
			this.recovered = value;
			return this;
		}

		/**
		 * API name: {@code reused}
		 */
		public Builder reused(Number value) {
			this.reused = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * Builds a {@link RecoveryFiles}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryFiles build() {

			return new RecoveryFiles(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryFiles}
	 */
	public static final JsonpDeserializer<RecoveryFiles> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RecoveryFiles::setupRecoveryFilesDeserializer);

	protected static void setupRecoveryFilesDeserializer(DelegatingDeserializer<RecoveryFiles.Builder> op) {

		op.add(Builder::details, JsonpDeserializer.arrayDeserializer(FileDetails.DESERIALIZER), "details");
		op.add(Builder::percent, JsonpDeserializer.jsonValueDeserializer(), "percent");
		op.add(Builder::recovered, JsonpDeserializer.numberDeserializer(), "recovered");
		op.add(Builder::reused, JsonpDeserializer.numberDeserializer(), "reused");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");

	}

}
