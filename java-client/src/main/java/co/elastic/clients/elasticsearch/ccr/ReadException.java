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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr._types.ReadException
@JsonpDeserializable
public class ReadException implements JsonpSerializable {
	private final ErrorCause exception;

	private final long fromSeqNo;

	private final int retries;

	// ---------------------------------------------------------------------------------------------

	private ReadException(Builder builder) {

		this.exception = ModelTypeHelper.requireNonNull(builder.exception, this, "exception");
		this.fromSeqNo = ModelTypeHelper.requireNonNull(builder.fromSeqNo, this, "fromSeqNo");
		this.retries = ModelTypeHelper.requireNonNull(builder.retries, this, "retries");

	}

	public static ReadException of(Function<Builder, ObjectBuilder<ReadException>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code exception}
	 */
	public final ErrorCause exception() {
		return this.exception;
	}

	/**
	 * Required - API name: {@code from_seq_no}
	 */
	public final long fromSeqNo() {
		return this.fromSeqNo;
	}

	/**
	 * Required - API name: {@code retries}
	 */
	public final int retries() {
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
		generator.write(this.fromSeqNo);

		generator.writeKey("retries");
		generator.write(this.retries);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReadException}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ReadException> {
		private ErrorCause exception;

		private Long fromSeqNo;

		private Integer retries;

		/**
		 * Required - API name: {@code exception}
		 */
		public final Builder exception(ErrorCause value) {
			this.exception = value;
			return this;
		}

		/**
		 * Required - API name: {@code exception}
		 */
		public final Builder exception(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.exception(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - API name: {@code from_seq_no}
		 */
		public final Builder fromSeqNo(long value) {
			this.fromSeqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code retries}
		 */
		public final Builder retries(int value) {
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
			_checkSingleUse();

			return new ReadException(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReadException}
	 */
	public static final JsonpDeserializer<ReadException> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReadException::setupReadExceptionDeserializer, Builder::build);

	protected static void setupReadExceptionDeserializer(DelegatingDeserializer<ReadException.Builder> op) {

		op.add(Builder::exception, ErrorCause._DESERIALIZER, "exception");
		op.add(Builder::fromSeqNo, JsonpDeserializer.longDeserializer(), "from_seq_no");
		op.add(Builder::retries, JsonpDeserializer.integerDeserializer(), "retries");

	}

}
