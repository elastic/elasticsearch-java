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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr._types.ReadException
public final class ReadException implements JsonpSerializable {
	private final ErrorCause exception;

	private final Number fromSeqNo;

	private final Number retries;

	// ---------------------------------------------------------------------------------------------

	public ReadException(Builder builder) {

		this.exception = Objects.requireNonNull(builder.exception, "exception");
		this.fromSeqNo = Objects.requireNonNull(builder.fromSeqNo, "from_seq_no");
		this.retries = Objects.requireNonNull(builder.retries, "retries");

	}

	/**
	 * API name: {@code exception}
	 */
	public ErrorCause exception() {
		return this.exception;
	}

	/**
	 * API name: {@code from_seq_no}
	 */
	public Number fromSeqNo() {
		return this.fromSeqNo;
	}

	/**
	 * API name: {@code retries}
	 */
	public Number retries() {
		return this.retries;
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

		generator.writeKey("exception");
		this.exception.serialize(generator, mapper);

		generator.writeKey("from_seq_no");
		generator.write(this.fromSeqNo.doubleValue());

		generator.writeKey("retries");
		generator.write(this.retries.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReadException}.
	 */
	public static class Builder implements ObjectBuilder<ReadException> {
		private ErrorCause exception;

		private Number fromSeqNo;

		private Number retries;

		/**
		 * API name: {@code exception}
		 */
		public Builder exception(ErrorCause value) {
			this.exception = value;
			return this;
		}

		/**
		 * API name: {@code exception}
		 */
		public Builder exception(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.exception(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code from_seq_no}
		 */
		public Builder fromSeqNo(Number value) {
			this.fromSeqNo = value;
			return this;
		}

		/**
		 * API name: {@code retries}
		 */
		public Builder retries(Number value) {
			this.retries = value;
			return this;
		}

		/**
		 * Builds a {@link ReadException}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReadException build() {

			return new ReadException(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReadException}
	 */
	public static final JsonpDeserializer<ReadException> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ReadException::setupReadExceptionDeserializer);

	protected static void setupReadExceptionDeserializer(DelegatingDeserializer<ReadException.Builder> op) {

		op.add(Builder::exception, ErrorCause.DESERIALIZER, "exception");
		op.add(Builder::fromSeqNo, JsonpDeserializer.numberDeserializer(), "from_seq_no");
		op.add(Builder::retries, JsonpDeserializer.numberDeserializer(), "retries");

	}

}
